package home.blackharold.springbootsecurityjpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "APP_USER",uniqueConstraints = {@UniqueConstraint(name = "APP_USER_UK", columnNames = "User_Name")} )
public class AppUser {
    
    @Id
    @GeneratedValue
    @Column (name = "user_id", nullable = false)
    private Long userId;
    
    
    @Column(name = "user_name", length = 36, nullable = false)
    private String userName;
    
    @Column (name = "encrypted_password", length = 128, nullable = false)
    private String encryptedPassword;
    
    @Column (name = "enabled", length = 1, nullable = false)
    private boolean enabled;
    
    public Long getUserId() {
        return userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getEncryptedPassword() {
        return encryptedPassword;
    }
    
    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }
    
    public boolean isEnabled() {
        return enabled;
    }
    
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
