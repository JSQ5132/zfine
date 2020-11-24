package com.ykxj.zfine.model.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author JiangShengQiang
 * @date 2020/11/24 14:14
 * @desc
 */
@Data
public class CompanyDTO {

    private String appid;

    private String appkey;

    @NotBlank(message = "商场名称不能为空")
    private String name;

    @NotBlank(message = "ERP系统类型不能为空")
    private String erpType;

    private String version;

    private String linkman;

    private String mobilePhone;

    private String email;

    private String address;

    private String customer;

    private Byte state;

    private String description;

    private Short createProviderAmount;
}
