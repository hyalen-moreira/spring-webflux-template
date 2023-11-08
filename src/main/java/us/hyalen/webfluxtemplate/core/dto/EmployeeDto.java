package us.hyalen.webfluxtemplate.core.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDto {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
}