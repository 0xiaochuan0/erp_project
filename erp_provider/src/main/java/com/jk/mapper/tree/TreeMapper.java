package com.jk.mapper.tree;

import com.jk.model.tree.Tree;

import java.util.List;

public interface TreeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tree record);

    int insertSelective(Tree record);

    Tree selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tree record);

    int updateByPrimaryKey(Tree record);

    List<Tree> getTreeAll(Integer id);
}