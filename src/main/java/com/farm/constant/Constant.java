package com.farm.constant;

/**
 * @name: Constant
 * @author: sutton
 * @date: 2023-04-26 23:27
 * @description: Constant
 */
public class Constant {
    /**
     * 表达是否常量枚举
     * @author wx
     */
    public interface YesOrNoConstant {

        /**
         * 是
         */
        Integer YES = 1;

        /**
         * 否
         */
        Integer NO = 0;

        static  Integer valueOf(Boolean yesOrNo){
            return yesOrNo.equals(YesOrNoBooleanConstant.YES) ? YES : NO;
        }
    }


    /**
     * 表达是否常量枚举
     * @author wx
     */
    public interface YesOrNoBooleanConstant {

        /**
         * 是
         */
        boolean YES = true;

        /**
         * 否
         */
        boolean NO = false;

        static boolean valueOf(Integer yesOrNo){
            return yesOrNo.equals(YesOrNoConstant.YES) ? YES : NO;
        }

    }

    public interface YesOrNoStringConstant {

        static String valueOf(Integer yesOrNo){
            return yesOrNo.equals(YesOrNoConstant.YES) ? "是" : "否";
        }

    }



    /**
     * 状态常量
     * @author wx
     */
    public interface StatusConstant {

        /**
         * 正常
         */
        Integer NORMAL = 0;

        /**
         * 停用
         */
        Integer DEACTIVATE = 1;

    }

}
