package kata2

import spock.lang.Specification
import spock.lang.Unroll


class KarateChopTest extends Specification {

    @Unroll
    def "test iterative chop implementation"() {
        when:
        int calculatedPosition = KarateChop.chopIterative(numberToFind, array as int[])

        then:
        calculatedPosition == expectedPositon

        where:
        numberToFind | array        || expectedPositon
        3            | []           || -1
        3            | [1]          || -1
        1            | [1]          || 0
        1            | [1, 3, 5]    || 0
        3            | [1, 3, 5]    || 1
        5            | [1, 3, 5]    || 2
        0            | [1, 3, 5]    || -1
        2            | [1, 3, 5]    || -1
        4            | [1, 3, 5]    || -1
        6            | [1, 3, 5]    || -1
        1            | [1, 3, 5, 7] || 0
        3            | [1, 3, 5, 7] || 1
        5            | [1, 3, 5, 7] || 2
        7            | [1, 3, 5, 7] || 3
        0            | [1, 3, 5, 7] || -1
        2            | [1, 3, 5, 7] || -1
        4            | [1, 3, 5, 7] || -1
        6            | [1, 3, 5, 7] || -1
        8            | [1, 3, 5, 7] || -1

    }

    @Unroll
    def "test recursive chop implementation"() {
        when:
        int calculatedPosition = KarateChop.chopRecursive(numberToFind, array as int[])

        then:
        calculatedPosition == expectedPositon

        where:
        numberToFind | array        || expectedPositon
        3            | []           || -1
        3            | [1]          || -1
        1            | [1]          || 0
        1            | [1, 3, 5]    || 0
        3            | [1, 3, 5]    || 1
        5            | [1, 3, 5]    || 2
        0            | [1, 3, 5]    || -1
        2            | [1, 3, 5]    || -1
        4            | [1, 3, 5]    || -1
        6            | [1, 3, 5]    || -1
        1            | [1, 3, 5, 7] || 0
        3            | [1, 3, 5, 7] || 1
        5            | [1, 3, 5, 7] || 2
        7            | [1, 3, 5, 7] || 3
        0            | [1, 3, 5, 7] || -1
        2            | [1, 3, 5, 7] || -1
        4            | [1, 3, 5, 7] || -1
        6            | [1, 3, 5, 7] || -1
        8            | [1, 3, 5, 7] || -1

    }

}
