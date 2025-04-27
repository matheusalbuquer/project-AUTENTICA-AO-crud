package tech.buildrun.springsecurity.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name= "tb_roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private UUID roleId;

    private String name;


    /*GETTERS AND SETTERS*/
    public UUID getRoleId() {
        return roleId;
    }

    public void setRoleId(UUID roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public enum Values(){
        ADMIN(1),
        BASIC(2L);


        long roleId;

        Values(long roleId){
            this.roleId = roleId;
        }

        public long getRoleId() {
            return roleId;
        }
    }

}
