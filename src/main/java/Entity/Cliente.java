package Entity;


import lombok.*;

@Data
@AllArgsConstructor
public class Cliente {

      private String nome;
      private String cpf;
      private String telefone;
      private String email;

      @Override
      public String toString() {
            return "--- Dados do Cliente ---\n     Nome: " + this.nome
                                    + "\n     CPF: " + this.cpf
                                    + "\n     Telefone: " + this.telefone
                                    + "\n     Email: " + this.email;
      }
}
