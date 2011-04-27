package subsumption.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import subsumption.diagram.providers.SubsumptionElementTypes;

/**
 * @generated
 */
public class SubsumptionPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createSubsumption1Group());
	}

	/**
	 * Creates "subsumption" palette tool group
	 * @generated
	 */
	private PaletteContainer createSubsumption1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Subsumption1Group_title);
		paletteContainer.setId("createSubsumption1Group"); //$NON-NLS-1$
		paletteContainer.add(createModule1CreationTool());
		paletteContainer.add(createInput2CreationTool());
		paletteContainer.add(createOutput3CreationTool());
		paletteContainer.add(createWire4CreationTool());
		paletteContainer.add(createSuppressor5CreationTool());
		paletteContainer.add(createInhibitor6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModule1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Module1CreationTool_title,
				Messages.Module1CreationTool_desc,
				Collections.singletonList(SubsumptionElementTypes.Module_2001));
		entry.setId("createModule1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SubsumptionElementTypes
				.getImageDescriptor(SubsumptionElementTypes.Module_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInput2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Input2CreationTool_title,
				Messages.Input2CreationTool_desc,
				Collections.singletonList(SubsumptionElementTypes.Input_3001));
		entry.setId("createInput2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SubsumptionElementTypes
				.getImageDescriptor(SubsumptionElementTypes.Input_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutput3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Output3CreationTool_title,
				Messages.Output3CreationTool_desc,
				Collections.singletonList(SubsumptionElementTypes.Output_3002));
		entry.setId("createOutput3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SubsumptionElementTypes
				.getImageDescriptor(SubsumptionElementTypes.Output_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWire4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SubsumptionElementTypes.OutputSink_4001);
		types.add(SubsumptionElementTypes.OutputActivates_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Wire4CreationTool_title,
				Messages.Wire4CreationTool_desc, types);
		entry.setId("createWire4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SubsumptionDiagramEditorPlugin
				.findImageDescriptor("/subsumption.edit/icons/full/obj16/Wire.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSuppressor5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Suppressor5CreationTool_title,
				Messages.Suppressor5CreationTool_desc,
				Collections
						.singletonList(SubsumptionElementTypes.Suppressor_3003));
		entry.setId("createSuppressor5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SubsumptionElementTypes
				.getImageDescriptor(SubsumptionElementTypes.Suppressor_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInhibitor6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Inhibitor6CreationTool_title,
				Messages.Inhibitor6CreationTool_desc,
				Collections
						.singletonList(SubsumptionElementTypes.Inhibitor_3004));
		entry.setId("createInhibitor6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SubsumptionElementTypes
				.getImageDescriptor(SubsumptionElementTypes.Inhibitor_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
