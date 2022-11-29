package lk.ijse.dep9.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ToDoItem implements SuperEntity {

     private String description;
     private int id;
     private String user_name;
     private Status status;

}
