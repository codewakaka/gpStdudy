package com.gupaedu.vip.pattern.singleton.registerEnum;

/**
 * @author xgh
 * 通用api中使用
 */

public enum ColorEnum {
   Red(){
       private int r =255;
       private int g =0;
       private int b =0;

       @Override
       public String toString() {
           return r+"--"+g+"--"+b;
       }
   },
    BLACK(){
        private int r =0;
        private int g =0;
        private int b =0;
    },
    WRITE(){
        private int r =255;
        private int g =255;
        private int b =255;
    }
}
