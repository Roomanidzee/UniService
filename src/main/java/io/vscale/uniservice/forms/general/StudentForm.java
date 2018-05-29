package io.vscale.uniservice.forms.general;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.ToString;
import lombok.NoArgsConstructor;

/**
 * 11.03.2018
 *
 * @author Andrey Romanov
 * @version 1.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class StudentForm {

    private String secondName;
    private String firstName;
    private String lastName;
    private String type;
    private Byte course;
    private String group;

}
