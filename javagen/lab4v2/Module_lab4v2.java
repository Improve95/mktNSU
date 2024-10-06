// HASH COLLISIONS: YES
// timestamp: 1727663787000

package lab4v2;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_lab4v2 {
	public static final Object[] f_Inds2(Object[] aa, int am) {
		final Struct l2_$1 = Module_tree.f_makeTree();
		final Func3<Struct,Integer, Struct, Integer> l3_$0 = (Func3<Struct, Integer, Struct, Integer>)(Integer ai, Struct at, Integer avalue) -> {
			return Module_tree.f_treePushToArrayValue(at, avalue, ai);
		};
		final Struct l4_tree = ((Struct)Native.foldi(aa, l2_$1, ((Func3<Object,Integer, Object, Object>)(Func3)l3_$0)));
		final Object[] l7_$6 = SingletonStructs.arr_empty;
		final int l9_m = am;
		final Func3<Object[],Integer, Object[], Integer> l8_$5 = (Func3<Object[], Integer, Object[], Integer>)(Integer ai, Object[] apairs, Integer aa_i) -> {
			final Object[] l11_$10 = Module_tree.f_getTreeArrayValue(l4_tree, (l9_m-((int)aa_i)));
			final Func1<Struct_Pair,Integer> l12_$9 = (Func1<Struct_Pair, Integer>)(Integer ax) -> {
				return (new Struct_Pair(ax, ai));
			};
			return Native.concat(apairs, Native.map(l11_$10, ((Func1<Object,Object>)(Func1)l12_$9)));
		};
		return ((Object[])Native.foldi(aa, l7_$6, ((Func3<Object,Integer, Object, Object>)(Func3)l8_$5)));
	}
	public static final Object f_main() {
		final int l0_m = 13;
		Object[] l1_a;
		l1_a=(new Object[] { (-1), 0, 2, 7, 0, 15, 5, (-7), 3, 4, 12, (-8), 6, 43, 3, (-7) });
		Module_runtime.f_println(Module_lab4v2.f_Inds2(l1_a, l0_m));
		return Native.quit(0);
	}
}
