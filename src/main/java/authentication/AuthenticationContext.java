package authentication;

import entity.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Getter
@Setter
@Component
@RequestScope
public class AuthenticationContext {
    private User principal;
}
