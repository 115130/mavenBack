package com.chinasofti.dao;

import com.chinasofti.entity.Emp;

import java.util.List;

public interface BaseDao<E> {

    public List<E> queryAll();
    public int insert(E e);
    public int update(E e);
    public int delete(int i);
    public List<E> queryByPage(int i,int j);
    public List<E> queryByName(String name);
}
