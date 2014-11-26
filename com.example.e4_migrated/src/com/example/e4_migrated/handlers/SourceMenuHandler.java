 
package com.example.e4_migrated.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class SourceMenuHandler {
	@Execute
	public void execute(Shell shell) {
		MessageDialog.openInformation(shell, "E4 handler exexuted", "Congratulations! You just executed an E4 handler.");
	}
}
