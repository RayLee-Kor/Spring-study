package mystudy.mystudyspring.domain.test.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class TestDataUpdateRequestDto {

    @NonNull
    private UUID id;

    @NonNull
    private String name;

    private String content;

}
