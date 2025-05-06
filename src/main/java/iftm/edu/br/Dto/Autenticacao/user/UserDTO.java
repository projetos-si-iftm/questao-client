package iftm.edu.br.Dto.Autenticacao.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
  private String email;
  private String password;
  private String name;
  private String classId;
}
