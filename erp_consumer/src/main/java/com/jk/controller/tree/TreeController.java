package com.jk.controller.tree;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.tree.Tree;
import com.jk.service.tree.TreeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tree")
public class TreeController {

    @Reference(version = "1.0.0")
    private TreeService treeService;

    @RequestMapping("getTreeAll")
    public List<Tree> getTreeAll(){
        List<Tree> list = treeService.getTreeAll();
        return list;
    }
}
