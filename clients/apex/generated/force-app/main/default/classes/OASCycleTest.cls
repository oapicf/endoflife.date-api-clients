@isTest
private class OASCycleTest {
    @isTest
    private static void equalsSameInstance() {
        OASCycle cycle1 = OASCycle.getExample();
        OASCycle cycle2 = cycle1;
        OASCycle cycle3 = new OASCycle();
        OASCycle cycle4 = cycle3;

        System.assert(cycle1.equals(cycle2));
        System.assert(cycle2.equals(cycle1));
        System.assert(cycle1.equals(cycle1));
        System.assert(cycle3.equals(cycle4));
        System.assert(cycle4.equals(cycle3));
        System.assert(cycle3.equals(cycle3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCycle cycle1 = OASCycle.getExample();
        OASCycle cycle2 = OASCycle.getExample();
        OASCycle cycle3 = new OASCycle();
        OASCycle cycle4 = new OASCycle();

        System.assert(cycle1.equals(cycle2));
        System.assert(cycle2.equals(cycle1));
        System.assert(cycle3.equals(cycle4));
        System.assert(cycle4.equals(cycle3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCycle cycle1 = OASCycle.getExample();
        OASCycle cycle2 = new OASCycle();

        System.assertEquals(false, cycle1.equals('foo'));
        System.assertEquals(false, cycle2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCycle cycle1 = OASCycle.getExample();
        OASCycle cycle2 = new OASCycle();
        OASCycle cycle3;

        System.assertEquals(false, cycle1.equals(cycle3));
        System.assertEquals(false, cycle2.equals(cycle3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCycle cycle1 = OASCycle.getExample();
        OASCycle cycle2 = new OASCycle();

        System.assertEquals(cycle1.hashCode(), cycle1.hashCode());
        System.assertEquals(cycle2.hashCode(), cycle2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCycle cycle1 = OASCycle.getExample();
        OASCycle cycle2 = OASCycle.getExample();
        OASCycle cycle3 = new OASCycle();
        OASCycle cycle4 = new OASCycle();

        System.assert(cycle1.equals(cycle2));
        System.assert(cycle3.equals(cycle4));
        System.assertEquals(cycle1.hashCode(), cycle2.hashCode());
        System.assertEquals(cycle3.hashCode(), cycle4.hashCode());
    }
}
