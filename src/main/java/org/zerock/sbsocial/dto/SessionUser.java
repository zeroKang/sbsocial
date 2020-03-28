package org.zerock.sbsocial.dto;

import lombok.Getter;
import org.zerock.sbsocial.entity.Member;

@Getter
public class SessionUser {

    private String name;
    private String email;
    private String picture;

    public SessionUser(Member user) {

        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
