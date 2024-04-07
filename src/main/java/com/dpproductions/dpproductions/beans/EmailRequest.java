package com.dpproductions.dpproductions.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailRequest {

    private String to;
    private String name;
    private String email;
    private String subject;
    private String message;
}
