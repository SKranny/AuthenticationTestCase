package AuthService.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Запрос логин")
public class LoginRequest {
    @Email
    @NotBlank
    @Schema(description = "E-mail")
    private String email;

    @NotBlank
    @Schema(description = "Пароль")
    private String password;
}
