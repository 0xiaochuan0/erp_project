package com.jk.controller.purchase;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.purchase.Credential;
import com.jk.model.purchase.Good;
import com.jk.model.purchase.Purchase;
import com.jk.service.purchase.IPurchaseService;
import com.jk.util.OSSClientUtil;
import com.jk.util.UploadifyUtil;
import com.jk.utils.ResultPage;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("purchase")
public class PurchaseController {

    @Reference(version = "1.0.0")
    private IPurchaseService purchaserService;

    @Autowired
   private   OSSClientUtil  ossClientUtil;
    /***
     * 展示供应商管理页面
     */
    @RequiresPermissions("showPurchse:query")
    @RequestMapping("showPurchase")
    public String  showPurchase(){
        return  "purchase/showPurchse";
    }
    /**
     * 展示添加页面
     */
    @RequiresPermissions("addPurchse:save")
    @RequestMapping("savePurchase")
    public String  savePurchase(){
        return  "purchase/addPurchse";
    }

    @RequiresPermissions("caiGou:query")
    @RequestMapping("cai")
    public String  cai(){
        return  "purchase/caiGou";
    }


    @RequiresPermissions("updatePurchse:update")
    @RequestMapping("updatePurchse")
    public String  updatePurchse(String  supplierNumber, HttpServletRequest  request){
        request.getSession().setAttribute("supplierNumber",supplierNumber);
        return  "purchase/updatePurchse";
    }

    /***
     *
     * 查询供应商管理页面
     */
    @RequiresPermissions("showPurchse:query")
    @RequestMapping("queryPurchase")
    @ResponseBody
    public ResultPage queryPurchase(Integer  page, Integer  rows, Purchase puerchaser,String  creatate){

        return  purchaserService.queryPurchase(page, rows,puerchaser,creatate);
    }
    /***
     *
     * 新增
     */
    @RequiresPermissions("addPurchse:save")
    @RequestMapping("addPurchase")
    @ResponseBody
    public boolean  addPurchase(Purchase  purchase){
        if(purchase.getId()!=null){
            purchaserService.updatePurchase(purchase);
        }else{
            purchaserService.addPurchase(purchase);
        }
        return  true;
    }
    /***
     *
     * 回显
     */

    @RequestMapping("huiPurchase")
    @ResponseBody
    public   Purchase   huiPurchase( HttpServletRequest  request){
        String supplierNumber = (String) request.getSession().getAttribute("supplierNumber");
        System.out.println(supplierNumber);
        Purchase  purchase= purchaserService.huiPurchase(supplierNumber);
        return  purchase;
    }
    @RequiresPermissions("addPurchse:save")
    @RequestMapping("addGood")
    @ResponseBody
    public boolean  addGood(String  arr){
        purchaserService.addGood(arr);
        return  true;
    }

    @RequestMapping("huiGood")
    public  void  huiGood(HttpServletRequest  request,Model  m){
        String supplierNumber = (String) request.getSession().getAttribute("supplierNumber");
        System.out.println(supplierNumber);
        List<Good>  good= purchaserService.huiGood(supplierNumber);
        m.addAttribute("good",good);
    }

    @RequestMapping("uploadImg")
    @ResponseBody
    public String uploadImg(MultipartFile imgFile, HttpServletRequest request) throws Exception {
        String image = ossClientUtil.checkImage(imgFile);
        return image;
    }
    @RequiresPermissions("addPurchse:save")
    @RequestMapping("addZheng")
    @ResponseBody
    public  boolean   addZheng(Credential credential){
        purchaserService.addZheng(credential);
        return  true;
    }

    @RequiresPermissions("updatStatus:update")
    @RequestMapping("updatStatus")
    @ResponseBody
    public  boolean updatStatus(String  num,Integer  status){
        purchaserService.updatStatus(num,status);
        return  true;
    }
}
