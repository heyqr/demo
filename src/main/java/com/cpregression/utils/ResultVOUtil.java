package com.cpregression.utils;

import com.cpregression.viewobject.ResultVO;

public class ResultVOUtil {


    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

    /*
    public static ResultVO error() {
        return error(ResultVOStatusEnum.FAIL.getCode(), ResultVOStatusEnum.FAIL.getMsg());
    }
    */
}
