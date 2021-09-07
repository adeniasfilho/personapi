package one.digitalinnovation.personapi.request;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NotNull
    @BatchSize(size = 100 )
    private String firstName;

    @NotNull
    @BatchSize(size = 100)
    private String lastName;

    @NotNull
    private String cpf;

    private String birthDate;


    @NotNull
    private List<PhoneDTO> phones;
}
