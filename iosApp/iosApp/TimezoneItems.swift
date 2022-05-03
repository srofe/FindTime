//
// Created by Simon Rofe on 4/5/2022.
// Copyright (c) 2022 orgName. All rights reserved.
//

import SwiftUI
import shared

class TimezoneItems: ObservableObject {
    @Published var timezones: [String] = []
    @Published var selectedTimezones = Set<String>()

    init() {
        self.timezones = TimeZoneHelperImpl().getTimeZoneStrings()
    }
}
