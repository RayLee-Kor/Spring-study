package mystudy.mystudyspring.domain.test.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloRequestDto {

    @NotEmpty
    private String stringValue;

    @NotNull
    private Long intValue;
}