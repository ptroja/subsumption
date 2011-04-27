package subsumption.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import subsumption.SubsumptionPackage;
import subsumption.diagram.edit.parts.InhibitorTimeEditPart;
import subsumption.diagram.edit.parts.ModuleNameEditPart;
import subsumption.diagram.edit.parts.OutputNameEditPart;
import subsumption.diagram.edit.parts.SuppressorTimeEditPart;
import subsumption.diagram.parsers.MessageFormatParser;
import subsumption.diagram.part.SubsumptionVisualIDRegistry;

/**
 * @generated
 */
public class SubsumptionParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser moduleName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getModuleName_5001Parser() {
		if (moduleName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { SubsumptionPackage.eINSTANCE
					.getModule_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			moduleName_5001Parser = parser;
		}
		return moduleName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser suppressorTime_5003Parser;

	/**
	 * @generated
	 */
	private IParser getSuppressorTime_5003Parser() {
		if (suppressorTime_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { SubsumptionPackage.eINSTANCE
					.getSuppressor_Time() };
			MessageFormatParser parser = new MessageFormatParser(features);
			suppressorTime_5003Parser = parser;
		}
		return suppressorTime_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser outputName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getOutputName_5005Parser() {
		if (outputName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { SubsumptionPackage.eINSTANCE
					.getOutput_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outputName_5005Parser = parser;
		}
		return outputName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser inhibitorTime_5004Parser;

	/**
	 * @generated
	 */
	private IParser getInhibitorTime_5004Parser() {
		if (inhibitorTime_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { SubsumptionPackage.eINSTANCE
					.getInhibitor_Time() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inhibitorTime_5004Parser = parser;
		}
		return inhibitorTime_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ModuleNameEditPart.VISUAL_ID:
			return getModuleName_5001Parser();
		case SuppressorTimeEditPart.VISUAL_ID:
			return getSuppressorTime_5003Parser();
		case OutputNameEditPart.VISUAL_ID:
			return getOutputName_5005Parser();
		case InhibitorTimeEditPart.VISUAL_ID:
			return getInhibitorTime_5004Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(SubsumptionVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(SubsumptionVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (SubsumptionElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
