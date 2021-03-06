package com.decathlon.ara.postman.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Wither;

@Data
@Wither
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Collection {

    /**
     * Root folders of the tree of folders and requests of the Postman collection.
     */
    private Item[] item;

    /**
     * Contains the name of the Postman collection.
     */
    private Info info;

}
