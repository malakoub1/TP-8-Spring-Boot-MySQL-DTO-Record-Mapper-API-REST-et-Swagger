package ma.fst.studentapi.dto;


//ce dto represente les donnees renvoyees par API au client
public record StudentResponseDTO(
        Long id,
        String firstName,
        String lastName,
        String email,
        String major,
        Integer age
) {
}