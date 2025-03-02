package com.thinkhub.web.exception.auth;

import com.thinkhub.constant.Constants;
import com.thinkhub.model.AjaxResult;
import com.thinkhub.model.auth.LoginBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: SysLoginController
 * @Author: Simon
 * @Date: 2025/2/18 22:55
 * @Version: 1.0
 */
@RestController
public class SysLoginController {
    /**
     * 登录方法
     *
     * @param loginBody 登录信息
     * @return 结果
     */
    @PostMapping("/login")
    public AjaxResult login(@RequestBody LoginBody loginBody) {
        AjaxResult ajax = AjaxResult.success();
        // 生成令牌
        //String token = loginService.login(loginBody.getUsername(), loginBody.getPassword(), loginBody.getCode(),
        //        loginBody.getUuid());
        ajax.put(Constants.TOKEN, "123");
        return ajax;
    }
}