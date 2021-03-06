package com.decathlon.ara.service.dto.response;

import com.decathlon.ara.service.dto.problem.ProblemDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PickUpPatternDTO {

    private ProblemDTO destinationProblem;
    private ProblemDTO deletedProblem;

}
