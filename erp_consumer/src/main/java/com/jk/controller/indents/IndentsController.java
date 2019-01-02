package com.jk.controller.indents;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.indents.Indents;
import com.jk.service.indents.IndentsService;
import com.jk.utils.ResultPage;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: erp_project
 * @description:
 * @author: 孙佳
 * @create: 2019-01-01 14:38
 **/
@Controller
@RequestMapping("indents")
public class IndentsController {
    @Reference(version = "1.0.0")
    private IndentsService indentsService;


    @RequestMapping("query")
    @ResponseBody
    public ResultPage queryList(Integer page, Integer rows,Indents indents){
        ResultPage resultPage = indentsService.queryList(page, rows,indents);
        return resultPage;
    }

    @RequiresPermissions("indent:query")
    @RequestMapping("toShow")
    public String  toShow(){
        return "show";
    }

    @RequestMapping("export")
    @ResponseBody
    public void  exportBook(HttpServletResponse response) {
        String   title="订单";

        String[]  rowName= {"订单编号","用户帐号","提交时间","订单金额","支付方式","订单来源","订单状态"};

        List<Object[]> dataList=new ArrayList<Object[]>();

        List<Indents>  list=indentsService.showIndents();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (Indents book : list) {

            Object[] object=new Object[rowName.length];
            object[0]=book.getId();
            object[1]=book.getConsumer();
            object[2]=book.getCreatTime();
            object[3]=book.getMoney();
            object[4]=book.getPayId();
            object[5]=book.getFromId();
            object[6]=book.getPayStatus();

            dataList.add(object);
        }
        ExportExcel expoet=new ExportExcel(title, rowName, dataList, response);
        try {
            expoet.export();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @RequestMapping("importExcel")
    @ResponseBody
    public void importExcel(MultipartFile file, HttpServletRequest request){
        //获得上传文件上传的类型
        String contentType = file.getContentType();
        //上传文件的名称
        String fileName = file.getOriginalFilename();
        //获得文件的后缀名
        String fileType = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));

        //上传文件的新的路径
        //生成新的文件名称
        String filePath = "./src/main/resources/templates/imgupload/";

        //创建list集合接收excel中读取的数据
        List<Indents> list =new ArrayList<Indents>();
        try {

            uploadFile(file.getBytes(), filePath, fileName);
            if(fileType.equals(".xls")){
                //通过上传的文件创建hssfworkbook对象
                FileInputStream fileInputStream = new FileInputStream(filePath+fileName);
                HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
                //通过workbook对象获得sheet的集合循环遍历
                for(int i=0;i<workbook.getNumberOfSheets();i++){
                    //获得其中每一个sheet页
                    HSSFSheet sheetAt = workbook.getSheetAt(i);
                    //获得每一行以后循环遍历列
                    for (int j = 3; j < sheetAt.getPhysicalNumberOfRows(); j++) {
                        //通过行获得每一列
                        HSSFRow row = sheetAt.getRow(j);
                        //获得表格的每一列后需要把获得值放到对象
                        Indents book=new Indents();
                        //判断是否为空
                        if(!"".equals(row.getCell(1)) && row.getCell(1)!=null){
                            book.setConsumer(this.getCellValue(row.getCell(1)));
                        }
                        if(!"".equals(row.getCell(2)) && row.getCell(2)!=null){
                            book.setCreatTime(this.getCellValue(row.getCell(2)));
                        }
                        if(!"".equals(row.getCell(3)) && row.getCell(3)!=null){
                            book.setMoney(Integer.parseInt(this.getCellValue(row.getCell(3))));
                        }
                        /*if(!"".equals(row.getCell(5)) && row.getCell(5)!=null){
                            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                            book.setCreatTime(sdf.parse(this.getCellValue(row.getCell(5))));
                        }*/
                        if(!"".equals(row.getCell(4)) && row.getCell(4)!=null){
                            book.setPayId(Integer.parseInt(this.getCellValue(row.getCell(4))));
                        }
                        if(!"".equals(row.getCell(5)) && row.getCell(5)!=null){
                            book.setFromId(Integer.parseInt(this.getCellValue(row.getCell(5))));
                        }

                        if(!"".equals(row.getCell(6)) && row.getCell(6)!=null){
                            book.setPayStatus(Integer.parseInt(this.getCellValue(row.getCell(6))));
                        }

                        //把book对象放到list集合中去
                        list.add(book);
                    }
                }

                indentsService.insertMany(list);

            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    //判断从Excel文件中解析出来数据的格式
    private static String getCellValue(XSSFCell cell){
        String value = null;
        //简单的查检列类型
        switch(cell.getCellType())
        {
            case HSSFCell.CELL_TYPE_STRING://字符串
                value = cell.getRichStringCellValue().getString();
                break;
            case HSSFCell.CELL_TYPE_NUMERIC://数字
                int dd = (int)cell.getNumericCellValue();
                value = dd+"";
                break;
            case HSSFCell.CELL_TYPE_BLANK:
                value = "";
                break;
            case HSSFCell.CELL_TYPE_FORMULA:
                value = String.valueOf(cell.getCellFormula());
                break;
            case HSSFCell.CELL_TYPE_BOOLEAN://boolean型值
                value = String.valueOf(cell.getBooleanCellValue());
                break;
            case HSSFCell.CELL_TYPE_ERROR:
                value = String.valueOf(cell.getErrorCellValue());
                break;
            default:
                break;
        }
        return value;
    }

    //判断从Excel文件中解析出来数据的格式
    private static String getCellValue(HSSFCell cell){
        String value = null;
        //简单的查检列类型
        switch(cell.getCellType())
        {
            case HSSFCell.CELL_TYPE_STRING://字符串
                value = cell.getRichStringCellValue().getString();
                break;
            case HSSFCell.CELL_TYPE_NUMERIC://数字
                int dd = (int)cell.getNumericCellValue();
                value = dd+"";
                break;
            case HSSFCell.CELL_TYPE_BLANK:
                value = "";
                break;
            case HSSFCell.CELL_TYPE_FORMULA:
                value = String.valueOf(cell.getCellFormula());
                break;
            case HSSFCell.CELL_TYPE_BOOLEAN://boolean型值
                value = String.valueOf(cell.getBooleanCellValue());
                break;
            case HSSFCell.CELL_TYPE_ERROR:
                value = String.valueOf(cell.getErrorCellValue());
                break;
            default:
                break;
        }
        return value;
    }

    public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath + fileName);
        out.write(file);
        out.flush();
        out.close();
    }






}
