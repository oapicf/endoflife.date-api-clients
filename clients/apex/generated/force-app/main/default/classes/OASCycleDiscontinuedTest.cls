@isTest
private class OASCycleDiscontinuedTest {
    @isTest
    private static void equalsSameInstance() {
        OASCycleDiscontinued cycleDiscontinued1 = OASCycleDiscontinued.getExample();
        OASCycleDiscontinued cycleDiscontinued2 = cycleDiscontinued1;
        OASCycleDiscontinued cycleDiscontinued3 = new OASCycleDiscontinued();
        OASCycleDiscontinued cycleDiscontinued4 = cycleDiscontinued3;

        System.assert(cycleDiscontinued1.equals(cycleDiscontinued2));
        System.assert(cycleDiscontinued2.equals(cycleDiscontinued1));
        System.assert(cycleDiscontinued1.equals(cycleDiscontinued1));
        System.assert(cycleDiscontinued3.equals(cycleDiscontinued4));
        System.assert(cycleDiscontinued4.equals(cycleDiscontinued3));
        System.assert(cycleDiscontinued3.equals(cycleDiscontinued3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCycleDiscontinued cycleDiscontinued1 = OASCycleDiscontinued.getExample();
        OASCycleDiscontinued cycleDiscontinued2 = OASCycleDiscontinued.getExample();
        OASCycleDiscontinued cycleDiscontinued3 = new OASCycleDiscontinued();
        OASCycleDiscontinued cycleDiscontinued4 = new OASCycleDiscontinued();

        System.assert(cycleDiscontinued1.equals(cycleDiscontinued2));
        System.assert(cycleDiscontinued2.equals(cycleDiscontinued1));
        System.assert(cycleDiscontinued3.equals(cycleDiscontinued4));
        System.assert(cycleDiscontinued4.equals(cycleDiscontinued3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCycleDiscontinued cycleDiscontinued1 = OASCycleDiscontinued.getExample();
        OASCycleDiscontinued cycleDiscontinued2 = new OASCycleDiscontinued();

        System.assertEquals(false, cycleDiscontinued1.equals('foo'));
        System.assertEquals(false, cycleDiscontinued2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCycleDiscontinued cycleDiscontinued1 = OASCycleDiscontinued.getExample();
        OASCycleDiscontinued cycleDiscontinued2 = new OASCycleDiscontinued();
        OASCycleDiscontinued cycleDiscontinued3;

        System.assertEquals(false, cycleDiscontinued1.equals(cycleDiscontinued3));
        System.assertEquals(false, cycleDiscontinued2.equals(cycleDiscontinued3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCycleDiscontinued cycleDiscontinued1 = OASCycleDiscontinued.getExample();
        OASCycleDiscontinued cycleDiscontinued2 = new OASCycleDiscontinued();

        System.assertEquals(cycleDiscontinued1.hashCode(), cycleDiscontinued1.hashCode());
        System.assertEquals(cycleDiscontinued2.hashCode(), cycleDiscontinued2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCycleDiscontinued cycleDiscontinued1 = OASCycleDiscontinued.getExample();
        OASCycleDiscontinued cycleDiscontinued2 = OASCycleDiscontinued.getExample();
        OASCycleDiscontinued cycleDiscontinued3 = new OASCycleDiscontinued();
        OASCycleDiscontinued cycleDiscontinued4 = new OASCycleDiscontinued();

        System.assert(cycleDiscontinued1.equals(cycleDiscontinued2));
        System.assert(cycleDiscontinued3.equals(cycleDiscontinued4));
        System.assertEquals(cycleDiscontinued1.hashCode(), cycleDiscontinued2.hashCode());
        System.assertEquals(cycleDiscontinued3.hashCode(), cycleDiscontinued4.hashCode());
    }
}
