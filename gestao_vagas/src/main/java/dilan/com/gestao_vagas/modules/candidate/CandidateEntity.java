package dilan.com.gestao_vagas.modules.candidate;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity(name = "candidate")
public class CandidateEntity {
  
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private String name;

  @Pattern(regexp = "\\S+", message = "O Campo [username] não deve conter espaço! ")
  private String username;

  @Email(message = "Campo deve conter e-mail válido")
  private String email;

  @Length(min = 6, max = 20, message = "Senha deve conter minimo 6 e máximo 20 caracteres")
  private String password;


  private String descripton;
  private String curriculum;


  @CreationTimestamp
  private LocalDateTime createdAt;

}
