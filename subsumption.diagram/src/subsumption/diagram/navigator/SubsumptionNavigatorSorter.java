package subsumption.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import subsumption.diagram.part.SubsumptionVisualIDRegistry;

/**
 * @generated
 */
public class SubsumptionNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof SubsumptionNavigatorItem) {
			SubsumptionNavigatorItem item = (SubsumptionNavigatorItem) element;
			return SubsumptionVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
