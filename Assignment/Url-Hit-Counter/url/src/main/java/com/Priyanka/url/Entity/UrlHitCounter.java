package com.Priyanka.url.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UrlHitCounter {
    private String userName;

    private Integer counter;
}
