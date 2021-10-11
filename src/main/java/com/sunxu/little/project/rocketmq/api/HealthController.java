package com.sunxu.little.project.rocketmq.api;

import com.ruyuan.little.project.common.dto.CommonResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/9/10 16:51
 */
@RestController
public class HealthController {

    @RequestMapping(value = "/")
    public CommonResponse<String> health() {
        return CommonResponse.success("健康检查");
    }
}
