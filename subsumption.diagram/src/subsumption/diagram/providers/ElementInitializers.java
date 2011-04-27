package subsumption.diagram.providers;

import subsumption.diagram.part.SubsumptionDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = SubsumptionDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			SubsumptionDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
