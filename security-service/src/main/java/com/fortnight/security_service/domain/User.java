package domain;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User extends BaseEntity implements UserDetails, Serializable {

    @Override
    public String getUsername() {
        return null;
    }
    
    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public Collection< ? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    
    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @JsonIgnore
    @Override
    public boolean isEnabled() {
        return true;
    }
}
