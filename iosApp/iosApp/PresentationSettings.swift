//
//  PresentationSettings.swift
//  iosApp
//
//  Created by Simon Rofe on 5/5/2022.
//  Copyright © 2022 orgName. All rights reserved.
//

import SwiftUI

class TimezoneVariables: ObservableObject {
    @Published var showTimezoneDialog = false
}

class FindMeetingVariables: ObservableObject {
    @Published var showHoursDialog = false
}
