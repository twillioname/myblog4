package com.myblog.myblog4.Payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeadDto {
    private long id;
    private String Name;
    private String Title;
    private String City;
    private String Content;

}
