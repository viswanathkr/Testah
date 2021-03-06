package org.testah.runner.performance;

import org.testah.driver.http.requests.AbstractRequestDto;
import org.testah.util.TupleGenerator;

import java.util.Arrays;
import java.util.List;

public abstract class AbstractPerformanceRestRequest {
    protected TupleGenerator tupleGenerator;

    public AbstractPerformanceRestRequest(List<?>... lists) {
        tupleGenerator = new TupleGenerator(Arrays.stream(lists).mapToInt(list -> list.size()).toArray());
    }

    public abstract AbstractRequestDto<?> next();

    /**
     * Get the number of distinct tuples.
     *
     * @return count of distinct tuples
     */
    public int countDistinct() {
        return tupleGenerator.countDistinct();
    }
}
