package com.yurifernandes.bookstoremanager.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {
        
        private Long id;
        
        @NotBlank
        @Size(max = 200)
        private String name;

        @NotNull
        @Size(min = 18, max = 100)
        private Integer age;
}
