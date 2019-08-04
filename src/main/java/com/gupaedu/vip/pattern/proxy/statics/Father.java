package com.gupaedu.vip.pattern.proxy.statics;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/4 21:49
 */
public class Father {
    private Son son;
    public Father(Son son){
        this.son = son;
    }
    //没办法拓展
    public void  findLov(){
        System.out.println("物色=====");
        this.son.findLov();
        System.out.println("是否成功");
    }
}
