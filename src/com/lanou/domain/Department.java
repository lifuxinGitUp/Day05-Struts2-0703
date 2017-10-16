package com.lanou.domain;

import java.util.List;

/**
 * Created by dllo on 17/10/16.
 */
public class Department {
    private int id;   // 部门id
    private String pname; // 部门名称
    private List<Post> postList; // 当前部门下所有职务部门集合


    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }
}
