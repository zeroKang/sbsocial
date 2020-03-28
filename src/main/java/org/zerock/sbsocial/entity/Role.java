package org.zerock.sbsocial.entity;

import lombok.Getter;

@Getter
public enum  Role {

    GUEST("ROLE_GUEST"), USER("ROLE_USER");


    String value;

    Role(String value){
        this.value = value;
    }
}
