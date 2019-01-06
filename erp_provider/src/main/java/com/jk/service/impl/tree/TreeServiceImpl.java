package com.jk.service.impl.tree;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.tree.TreeMapper;
import com.jk.model.tree.Tree;
import com.jk.service.tree.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@Service(version = "1.0.0")
public class TreeServiceImpl implements TreeService {

    @Autowired
    private TreeMapper mapper;

    @Override
    @Cacheable(value="common", key="#root.methodName")
    public List<Tree> getTreeAll() {
        Integer id = 0;
        List<Tree> list = TreeNode(id);

        return list;
    }

    private List<Tree> TreeNode(Integer id) {
        List<Tree> list = mapper.getTreeAll(id);
        for (Tree tree : list) {
            List<Tree> list2 = TreeNode(tree.getId());
            if (list2 != null && list2.size() > 0) {
                tree.setLeaf(false);
                tree.setSelectable(false);
                tree.setNodes(list2);
            }else {
                tree.setLeaf(true);
                tree.setSelectable(true);
            }
        }

        return list;
    }
}
