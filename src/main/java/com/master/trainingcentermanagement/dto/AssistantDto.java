package com.master.trainingcentermanagement.dto;

import com.master.trainingcentermanagement.entity.Course;
import com.master.trainingcentermanagement.user.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssistantDto {

    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private Object image;
    private Role role;

}
