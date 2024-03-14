@isTest
private class OASCycleEolTest {
    @isTest
    private static void equalsSameInstance() {
        OASCycleEol cycleEol1 = OASCycleEol.getExample();
        OASCycleEol cycleEol2 = cycleEol1;
        OASCycleEol cycleEol3 = new OASCycleEol();
        OASCycleEol cycleEol4 = cycleEol3;

        System.assert(cycleEol1.equals(cycleEol2));
        System.assert(cycleEol2.equals(cycleEol1));
        System.assert(cycleEol1.equals(cycleEol1));
        System.assert(cycleEol3.equals(cycleEol4));
        System.assert(cycleEol4.equals(cycleEol3));
        System.assert(cycleEol3.equals(cycleEol3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCycleEol cycleEol1 = OASCycleEol.getExample();
        OASCycleEol cycleEol2 = OASCycleEol.getExample();
        OASCycleEol cycleEol3 = new OASCycleEol();
        OASCycleEol cycleEol4 = new OASCycleEol();

        System.assert(cycleEol1.equals(cycleEol2));
        System.assert(cycleEol2.equals(cycleEol1));
        System.assert(cycleEol3.equals(cycleEol4));
        System.assert(cycleEol4.equals(cycleEol3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCycleEol cycleEol1 = OASCycleEol.getExample();
        OASCycleEol cycleEol2 = new OASCycleEol();

        System.assertEquals(false, cycleEol1.equals('foo'));
        System.assertEquals(false, cycleEol2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCycleEol cycleEol1 = OASCycleEol.getExample();
        OASCycleEol cycleEol2 = new OASCycleEol();
        OASCycleEol cycleEol3;

        System.assertEquals(false, cycleEol1.equals(cycleEol3));
        System.assertEquals(false, cycleEol2.equals(cycleEol3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCycleEol cycleEol1 = OASCycleEol.getExample();
        OASCycleEol cycleEol2 = new OASCycleEol();

        System.assertEquals(cycleEol1.hashCode(), cycleEol1.hashCode());
        System.assertEquals(cycleEol2.hashCode(), cycleEol2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCycleEol cycleEol1 = OASCycleEol.getExample();
        OASCycleEol cycleEol2 = OASCycleEol.getExample();
        OASCycleEol cycleEol3 = new OASCycleEol();
        OASCycleEol cycleEol4 = new OASCycleEol();

        System.assert(cycleEol1.equals(cycleEol2));
        System.assert(cycleEol3.equals(cycleEol4));
        System.assertEquals(cycleEol1.hashCode(), cycleEol2.hashCode());
        System.assertEquals(cycleEol3.hashCode(), cycleEol4.hashCode());
    }
}
