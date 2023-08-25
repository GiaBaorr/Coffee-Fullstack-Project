package com.inn.cafe.entity;


import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;
import java.io.Serializable;

@NamedQuery(name = "User.findByEmailId",
        query = "select u from User u where u.email=:email")
@NamedQuery(name = "User.getAllUser",
        query = "select new com.inn.cafe.wrapper.UserWrapper(u.id,u.name,u.email,u.contactNumber,u.status) from User u where u.role='user'")
@NamedQuery(name = "User.getAllAdmin",
        query = "select u.email from User u where u.role='admin'")
@NamedQuery(name = "User.updateStatus",
        query = "update User u set u.status=:status where u.id=:id")
@Data
@Entity
@DynamicUpdate //only Update the column with data changed instead of update all columns again
@DynamicInsert //only Insert column with data instead of insert to all columns and set null
//Hibernate will have to detect which columns to be worked on -> slow down
//but it good for table with many columns and data
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    // the serialVersionUID is used to verify that the sender and receiver of the object have loaded the class
    // with the same structure and are therefore compatible.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name="contactNumber")
    private String contactNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "status")
    private String status;

    @Column(name = "role")
    private String role;


}
