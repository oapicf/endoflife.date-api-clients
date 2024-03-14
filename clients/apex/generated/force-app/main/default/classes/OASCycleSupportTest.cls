@isTest
private class OASCycleSupportTest {
    @isTest
    private static void equalsSameInstance() {
        OASCycleSupport cycleSupport1 = OASCycleSupport.getExample();
        OASCycleSupport cycleSupport2 = cycleSupport1;
        OASCycleSupport cycleSupport3 = new OASCycleSupport();
        OASCycleSupport cycleSupport4 = cycleSupport3;

        System.assert(cycleSupport1.equals(cycleSupport2));
        System.assert(cycleSupport2.equals(cycleSupport1));
        System.assert(cycleSupport1.equals(cycleSupport1));
        System.assert(cycleSupport3.equals(cycleSupport4));
        System.assert(cycleSupport4.equals(cycleSupport3));
        System.assert(cycleSupport3.equals(cycleSupport3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCycleSupport cycleSupport1 = OASCycleSupport.getExample();
        OASCycleSupport cycleSupport2 = OASCycleSupport.getExample();
        OASCycleSupport cycleSupport3 = new OASCycleSupport();
        OASCycleSupport cycleSupport4 = new OASCycleSupport();

        System.assert(cycleSupport1.equals(cycleSupport2));
        System.assert(cycleSupport2.equals(cycleSupport1));
        System.assert(cycleSupport3.equals(cycleSupport4));
        System.assert(cycleSupport4.equals(cycleSupport3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCycleSupport cycleSupport1 = OASCycleSupport.getExample();
        OASCycleSupport cycleSupport2 = new OASCycleSupport();

        System.assertEquals(false, cycleSupport1.equals('foo'));
        System.assertEquals(false, cycleSupport2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCycleSupport cycleSupport1 = OASCycleSupport.getExample();
        OASCycleSupport cycleSupport2 = new OASCycleSupport();
        OASCycleSupport cycleSupport3;

        System.assertEquals(false, cycleSupport1.equals(cycleSupport3));
        System.assertEquals(false, cycleSupport2.equals(cycleSupport3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCycleSupport cycleSupport1 = OASCycleSupport.getExample();
        OASCycleSupport cycleSupport2 = new OASCycleSupport();

        System.assertEquals(cycleSupport1.hashCode(), cycleSupport1.hashCode());
        System.assertEquals(cycleSupport2.hashCode(), cycleSupport2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCycleSupport cycleSupport1 = OASCycleSupport.getExample();
        OASCycleSupport cycleSupport2 = OASCycleSupport.getExample();
        OASCycleSupport cycleSupport3 = new OASCycleSupport();
        OASCycleSupport cycleSupport4 = new OASCycleSupport();

        System.assert(cycleSupport1.equals(cycleSupport2));
        System.assert(cycleSupport3.equals(cycleSupport4));
        System.assertEquals(cycleSupport1.hashCode(), cycleSupport2.hashCode());
        System.assertEquals(cycleSupport3.hashCode(), cycleSupport4.hashCode());
    }
}
