package subsumption.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import subsumption.Input;
import subsumption.System;
import subsumption.diagram.edit.parts.InhibitorEditPart;
import subsumption.diagram.edit.parts.InhibitorTimeEditPart;
import subsumption.diagram.edit.parts.InputEditPart;
import subsumption.diagram.edit.parts.ModuleEditPart;
import subsumption.diagram.edit.parts.ModuleNameEditPart;
import subsumption.diagram.edit.parts.OutputActivatesEditPart;
import subsumption.diagram.edit.parts.OutputEditPart;
import subsumption.diagram.edit.parts.OutputNameEditPart;
import subsumption.diagram.edit.parts.OutputSinkEditPart;
import subsumption.diagram.edit.parts.SuppressorEditPart;
import subsumption.diagram.edit.parts.SuppressorTimeEditPart;
import subsumption.diagram.edit.parts.SystemEditPart;
import subsumption.diagram.part.SubsumptionDiagramEditorPlugin;
import subsumption.diagram.part.SubsumptionVisualIDRegistry;
import subsumption.diagram.providers.SubsumptionElementTypes;
import subsumption.diagram.providers.SubsumptionParserProvider;

/**
 * @generated
 */
public class SubsumptionNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		SubsumptionDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		SubsumptionDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof SubsumptionNavigatorItem
				&& !isOwnView(((SubsumptionNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof SubsumptionNavigatorGroup) {
			SubsumptionNavigatorGroup group = (SubsumptionNavigatorGroup) element;
			return SubsumptionDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof SubsumptionNavigatorItem) {
			SubsumptionNavigatorItem navigatorItem = (SubsumptionNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (SubsumptionVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://subsumption/1.0?System", SubsumptionElementTypes.System_1000); //$NON-NLS-1$
		case InputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://subsumption/1.0?Input", SubsumptionElementTypes.Input_3001); //$NON-NLS-1$
		case SuppressorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://subsumption/1.0?Suppressor", SubsumptionElementTypes.Suppressor_3003); //$NON-NLS-1$
		case ModuleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://subsumption/1.0?Module", SubsumptionElementTypes.Module_2001); //$NON-NLS-1$
		case InhibitorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://subsumption/1.0?Inhibitor", SubsumptionElementTypes.Inhibitor_3004); //$NON-NLS-1$
		case OutputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://subsumption/1.0?Output", SubsumptionElementTypes.Output_3002); //$NON-NLS-1$
		case OutputSinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://subsumption/1.0?Output?sink", SubsumptionElementTypes.OutputSink_4001); //$NON-NLS-1$
		case OutputActivatesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://subsumption/1.0?Output?activates", SubsumptionElementTypes.OutputActivates_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = SubsumptionDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& SubsumptionElementTypes.isKnownElementType(elementType)) {
			image = SubsumptionElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof SubsumptionNavigatorGroup) {
			SubsumptionNavigatorGroup group = (SubsumptionNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof SubsumptionNavigatorItem) {
			SubsumptionNavigatorItem navigatorItem = (SubsumptionNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (SubsumptionVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getSystem_1000Text(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3001Text(view);
		case SuppressorEditPart.VISUAL_ID:
			return getSuppressor_3003Text(view);
		case ModuleEditPart.VISUAL_ID:
			return getModule_2001Text(view);
		case InhibitorEditPart.VISUAL_ID:
			return getInhibitor_3004Text(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_3002Text(view);
		case OutputSinkEditPart.VISUAL_ID:
			return getOutputSink_4001Text(view);
		case OutputActivatesEditPart.VISUAL_ID:
			return getOutputActivates_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getOutputActivates_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getModule_2001Text(View view) {
		IParser parser = SubsumptionParserProvider.getParser(
				SubsumptionElementTypes.Module_2001,
				view.getElement() != null ? view.getElement() : view,
				SubsumptionVisualIDRegistry
						.getType(ModuleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SubsumptionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInput_3001Text(View view) {
		Input domainModelElement = (Input) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			SubsumptionDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSystem_1000Text(View view) {
		System domainModelElement = (System) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			SubsumptionDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutput_3002Text(View view) {
		IParser parser = SubsumptionParserProvider.getParser(
				SubsumptionElementTypes.Output_3002,
				view.getElement() != null ? view.getElement() : view,
				SubsumptionVisualIDRegistry
						.getType(OutputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SubsumptionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSuppressor_3003Text(View view) {
		IParser parser = SubsumptionParserProvider.getParser(
				SubsumptionElementTypes.Suppressor_3003,
				view.getElement() != null ? view.getElement() : view,
				SubsumptionVisualIDRegistry
						.getType(SuppressorTimeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SubsumptionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutputSink_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getInhibitor_3004Text(View view) {
		IParser parser = SubsumptionParserProvider.getParser(
				SubsumptionElementTypes.Inhibitor_3004,
				view.getElement() != null ? view.getElement() : view,
				SubsumptionVisualIDRegistry
						.getType(InhibitorTimeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SubsumptionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return SystemEditPart.MODEL_ID.equals(SubsumptionVisualIDRegistry
				.getModelID(view));
	}

}
