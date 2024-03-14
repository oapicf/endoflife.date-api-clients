@isTest
private class OASCycleCycleTest {
    @isTest
    private static void equalsSameInstance() {
        OASCycleCycle cycleCycle1 = OASCycleCycle.getExample();
        OASCycleCycle cycleCycle2 = cycleCycle1;
        OASCycleCycle cycleCycle3 = new OASCycleCycle();
        OASCycleCycle cycleCycle4 = cycleCycle3;

        System.assert(cycleCycle1.equals(cycleCycle2));
        System.assert(cycleCycle2.equals(cycleCycle1));
        System.assert(cycleCycle1.equals(cycleCycle1));
        System.assert(cycleCycle3.equals(cycleCycle4));
        System.assert(cycleCycle4.equals(cycleCycle3));
        System.assert(cycleCycle3.equals(cycleCycle3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCycleCycle cycleCycle1 = OASCycleCycle.getExample();
        OASCycleCycle cycleCycle2 = OASCycleCycle.getExample();
        OASCycleCycle cycleCycle3 = new OASCycleCycle();
        OASCycleCycle cycleCycle4 = new OASCycleCycle();

        System.assert(cycleCycle1.equals(cycleCycle2));
        System.assert(cycleCycle2.equals(cycleCycle1));
        System.assert(cycleCycle3.equals(cycleCycle4));
        System.assert(cycleCycle4.equals(cycleCycle3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCycleCycle cycleCycle1 = OASCycleCycle.getExample();
        OASCycleCycle cycleCycle2 = new OASCycleCycle();

        System.assertEquals(false, cycleCycle1.equals('foo'));
        System.assertEquals(false, cycleCycle2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCycleCycle cycleCycle1 = OASCycleCycle.getExample();
        OASCycleCycle cycleCycle2 = new OASCycleCycle();
        OASCycleCycle cycleCycle3;

        System.assertEquals(false, cycleCycle1.equals(cycleCycle3));
        System.assertEquals(false, cycleCycle2.equals(cycleCycle3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCycleCycle cycleCycle1 = OASCycleCycle.getExample();
        OASCycleCycle cycleCycle2 = new OASCycleCycle();

        System.assertEquals(cycleCycle1.hashCode(), cycleCycle1.hashCode());
        System.assertEquals(cycleCycle2.hashCode(), cycleCycle2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCycleCycle cycleCycle1 = OASCycleCycle.getExample();
        OASCycleCycle cycleCycle2 = OASCycleCycle.getExample();
        OASCycleCycle cycleCycle3 = new OASCycleCycle();
        OASCycleCycle cycleCycle4 = new OASCycleCycle();

        System.assert(cycleCycle1.equals(cycleCycle2));
        System.assert(cycleCycle3.equals(cycleCycle4));
        System.assertEquals(cycleCycle1.hashCode(), cycleCycle2.hashCode());
        System.assertEquals(cycleCycle3.hashCode(), cycleCycle4.hashCode());
    }
}
