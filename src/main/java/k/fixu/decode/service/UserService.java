package k.fixu.decode.service;

import k.fixu.decode.domain.CodeUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author karrb
 * @version 1.0
 * @date 2019/02/19 14:30
 */
@Service("userService")
public class UserService implements UserDetailsService {
    @Autowired
    private CodeUserService codeUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //构建角色列表
        List<GrantedAuthority> grantedAuths = new ArrayList<>();
        grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
        CodeUser user = codeUserService.findOne(username);
        return new User(username, user.getPassword(), grantedAuths);
    }
}
